package typings
package ecmarkupLib.libBiblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("refId")
  var refId_TermBiblioEntry: java.lang.String
  @JSName("term")
  var term_TermBiblioEntry: java.lang.String
  @JSName("type")
  var type_TermBiblioEntry: ecmarkupLib.ecmarkupLibStrings.term
}

object TermBiblioEntry {
  @scala.inline
  def apply(
    refId: java.lang.String,
    referencingIds: js.Array[java.lang.String],
    term: java.lang.String,
    `type`: ecmarkupLib.ecmarkupLibStrings.term,
    aoid: java.lang.String = null,
    caption: java.lang.String = null,
    clauseId: java.lang.String = null,
    id: java.lang.String = null,
    key: java.lang.String = null,
    location: java.lang.String = null,
    name: java.lang.String = null,
    namespace: java.lang.String = null,
    number: java.lang.String | scala.Double = null,
    title: java.lang.String = null
  ): TermBiblioEntry = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("refId")(refId)
    __obj.updateDynamic("referencingIds")(referencingIds)
    __obj.updateDynamic("term")(term)
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

