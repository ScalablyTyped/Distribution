package typings.ecmarkup.libBiblioMod

import typings.ecmarkup.ecmarkupStrings.term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("refId")
  var refId_TermBiblioEntry: String
  @JSName("term")
  var term_TermBiblioEntry: String
  @JSName("type")
  var type_TermBiblioEntry: term
}

object TermBiblioEntry {
  @scala.inline
  def apply(
    refId: String,
    referencingIds: js.Array[String],
    term: String,
    `type`: term,
    aoid: String = null,
    caption: String = null,
    clauseId: String = null,
    id: String = null,
    key: String = null,
    location: String = null,
    name: String = null,
    namespace: String = null,
    number: String | Double = null,
    title: String = null
  ): TermBiblioEntry = {
    val __obj = js.Dynamic.literal(refId = refId, referencingIds = referencingIds, term = term)
    __obj.updateDynamic("type")(`type`)
    if (aoid != null) __obj.updateDynamic("aoid")(aoid)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TermBiblioEntry]
  }
}

