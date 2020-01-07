package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A people suggestion.
  */
@js.native
trait Schema$PeopleSuggestion extends js.Object {
  /**
    * Suggested person. All fields of the person object might not be populated.
    */
  var person: js.UndefOr[Schema$Person] = js.native
}

object Schema$PeopleSuggestion {
  @scala.inline
  def apply(person: Schema$Person = null): Schema$PeopleSuggestion = {
    val __obj = js.Dynamic.literal()
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PeopleSuggestion]
  }
}

