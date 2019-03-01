package typings
package ecmarkupLib.libBiblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClauseBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("aoid")
  var aoid_ClauseBiblioEntry: java.lang.String
  @JSName("id")
  var id_ClauseBiblioEntry: java.lang.String
  @JSName("number")
  var number_ClauseBiblioEntry: java.lang.String | scala.Double
  var titleHTML: java.lang.String
  @JSName("title")
  var title_ClauseBiblioEntry: java.lang.String
  @JSName("type")
  var type_ClauseBiblioEntry: ecmarkupLib.ecmarkupLibStrings.clause
}

object ClauseBiblioEntry {
  @scala.inline
  def apply(
    aoid: java.lang.String,
    id: java.lang.String,
    number: java.lang.String | scala.Double,
    referencingIds: js.Array[java.lang.String],
    title: java.lang.String,
    titleHTML: java.lang.String,
    `type`: ecmarkupLib.ecmarkupLibStrings.clause,
    caption: java.lang.String = null,
    clauseId: java.lang.String = null,
    key: java.lang.String = null,
    location: java.lang.String = null,
    name: java.lang.String = null,
    namespace: java.lang.String = null,
    refId: java.lang.String = null,
    term: java.lang.String = null
  ): ClauseBiblioEntry = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("aoid")(aoid)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.updateDynamic("referencingIds")(referencingIds)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleHTML")(titleHTML)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId)
    if (key != null) __obj.updateDynamic("key")(key)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (refId != null) __obj.updateDynamic("refId")(refId)
    if (term != null) __obj.updateDynamic("term")(term)
    __obj.asInstanceOf[ClauseBiblioEntry]
  }
}

