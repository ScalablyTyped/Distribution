package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines sources for the suggest/search APIs.
  */
@js.native
trait Schema$Source extends js.Object {
  /**
    * Source name for content indexed by the Indexing API.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Predefined content source for Google Apps.
    */
  var predefinedSource: js.UndefOr[String] = js.native
}

object Schema$Source {
  @scala.inline
  def apply(name: String = null, predefinedSource: String = null): Schema$Source = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predefinedSource != null) __obj.updateDynamic("predefinedSource")(predefinedSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Source]
  }
}

