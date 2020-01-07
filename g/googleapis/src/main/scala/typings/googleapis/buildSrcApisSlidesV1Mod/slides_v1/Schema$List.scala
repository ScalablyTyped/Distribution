package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A List describes the look and feel of bullets belonging to paragraphs
  * associated with a list. A paragraph that is part of a list has an implicit
  * reference to that list&#39;s ID.
  */
@js.native
trait Schema$List extends js.Object {
  /**
    * The ID of the list.
    */
  var listId: js.UndefOr[String] = js.native
  /**
    * A map of nesting levels to the properties of bullets at the associated
    * level. A list has at most nine levels of nesting, so the possible values
    * for the keys of this map are 0 through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[StringDictionary[Schema$NestingLevel]] = js.native
}

object Schema$List {
  @scala.inline
  def apply(listId: String = null, nestingLevel: StringDictionary[Schema$NestingLevel] = null): Schema$List = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$List]
  }
}

