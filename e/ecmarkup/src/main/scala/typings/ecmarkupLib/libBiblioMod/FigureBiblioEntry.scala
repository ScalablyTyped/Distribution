package typings
package ecmarkupLib.libBiblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FigureBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("id")
  var id_FigureBiblioEntry: java.lang.String
  @JSName("number")
  var number_FigureBiblioEntry: java.lang.String | scala.Double
  @JSName("type")
  var type_FigureBiblioEntry: ecmarkupLib.ecmarkupLibStrings.table | ecmarkupLib.ecmarkupLibStrings.figure | ecmarkupLib.ecmarkupLibStrings.example | ecmarkupLib.ecmarkupLibStrings.note
}

object FigureBiblioEntry {
  @scala.inline
  def apply(
    id: java.lang.String,
    number: java.lang.String | scala.Double,
    referencingIds: js.Array[java.lang.String],
    `type`: ecmarkupLib.ecmarkupLibStrings.table | ecmarkupLib.ecmarkupLibStrings.figure | ecmarkupLib.ecmarkupLibStrings.example | ecmarkupLib.ecmarkupLibStrings.note,
    aoid: java.lang.String = null,
    caption: java.lang.String = null,
    clauseId: java.lang.String = null,
    key: java.lang.String = null,
    location: java.lang.String = null,
    name: java.lang.String = null,
    namespace: java.lang.String = null,
    refId: java.lang.String = null,
    term: java.lang.String = null,
    title: java.lang.String = null
  ): FigureBiblioEntry = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.updateDynamic("referencingIds")(referencingIds)
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

