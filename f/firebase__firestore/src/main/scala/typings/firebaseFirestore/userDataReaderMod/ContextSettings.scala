package typings.firebaseFirestore.userDataReaderMod

import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the settings that are mutated as we parse user data. */
trait ContextSettings extends js.Object {
  /**
    * Whether or not this context corresponds to an element of an array.
    * If not set, elements are treated as if they were outside of arrays.
    */
  val arrayElement: js.UndefOr[Boolean] = js.undefined
  /** Indicates what kind of API method this data came from. */
  val dataSource: UserDataSource
  /** The name of the method the user called to create the ParseContext. */
  val methodName: String
  /**
    * A path within the object being parsed. This could be an empty path (in
    * which case the context represents the root of the data being parsed), or a
    * nonempty path (indicating the context represents a nested location within
    * the data).
    */
  val path: js.UndefOr[FieldPath] = js.undefined
}

object ContextSettings {
  @scala.inline
  def apply(
    dataSource: UserDataSource,
    methodName: String,
    arrayElement: js.UndefOr[Boolean] = js.undefined,
    path: FieldPath = null
  ): ContextSettings = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    if (!js.isUndefined(arrayElement)) __obj.updateDynamic("arrayElement")(arrayElement.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSettings]
  }
}

