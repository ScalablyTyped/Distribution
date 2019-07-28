package typings.ecmarkup.libBiblioMod

import typings.ecmarkup.ecmarkupStrings.example
import typings.ecmarkup.ecmarkupStrings.figure
import typings.ecmarkup.ecmarkupStrings.note
import typings.ecmarkup.ecmarkupStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FigureBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("id")
  var id_FigureBiblioEntry: String
  @JSName("number")
  var number_FigureBiblioEntry: String | Double
  @JSName("type")
  var type_FigureBiblioEntry: table | figure | example | note
}

object FigureBiblioEntry {
  @scala.inline
  def apply(
    id: String,
    number: String | Double,
    referencingIds: js.Array[String],
    `type`: table | figure | example | note,
    aoid: String = null,
    caption: String = null,
    clauseId: String = null,
    key: String = null,
    location: String = null,
    name: String = null,
    namespace: String = null,
    refId: String = null,
    term: String = null,
    title: String = null
  ): FigureBiblioEntry = {
    val __obj = js.Dynamic.literal(id = id, number = number.asInstanceOf[js.Any], referencingIds = referencingIds)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (aoid != null) __obj.updateDynamic("aoid")(aoid)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId)
    if (key != null) __obj.updateDynamic("key")(key)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (refId != null) __obj.updateDynamic("refId")(refId)
    if (term != null) __obj.updateDynamic("term")(term)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FigureBiblioEntry]
  }
}

