package typings.ecmarkup.biblioMod

import typings.ecmarkup.ecmarkupStrings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("id")
  var id_StepBiblioEntry: String
  var stepNumbers: js.Array[Double]
  @JSName("type")
  var type_StepBiblioEntry: step
}

object StepBiblioEntry {
  @scala.inline
  def apply(
    id: String,
    referencingIds: js.Array[String],
    stepNumbers: js.Array[Double],
    `type`: step,
    aoid: String = null,
    caption: String = null,
    clauseId: String = null,
    key: String = null,
    location: String = null,
    name: String = null,
    namespace: String = null,
    number: String | Double = null,
    refId: String = null,
    term: String = null,
    title: String = null
  ): StepBiblioEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (aoid != null) __obj.updateDynamic("aoid")(aoid.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (refId != null) __obj.updateDynamic("refId")(refId.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepBiblioEntry]
  }
}

