package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structured results that are returned as part of search request.
  */
@js.native
trait Schema$StructuredResult extends js.Object {
  /**
    * Representation of a person
    */
  var person: js.UndefOr[Schema$Person] = js.native
}

object Schema$StructuredResult {
  @scala.inline
  def apply(person: Schema$Person = null): Schema$StructuredResult = {
    val __obj = js.Dynamic.literal()
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StructuredResult]
  }
}

