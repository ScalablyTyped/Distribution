package typings
package ecmarkupLib.libBiblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("name")
  var name_ProductionBiblioEntry: java.lang.String
  @JSName("type")
  var type_ProductionBiblioEntry: ecmarkupLib.ecmarkupLibStrings.production
}

object ProductionBiblioEntry {
  @scala.inline
  def apply(
    name: java.lang.String,
    referencingIds: js.Array[java.lang.String],
    `type`: ecmarkupLib.ecmarkupLibStrings.production,
    aoid: java.lang.String = null,
    caption: java.lang.String = null,
    clauseId: java.lang.String = null,
    id: java.lang.String = null,
    key: java.lang.String = null,
    location: java.lang.String = null,
    namespace: java.lang.String = null,
    number: java.lang.String | scala.Double = null,
    refId: java.lang.String = null,
    term: java.lang.String = null,
    title: java.lang.String = null
  ): ProductionBiblioEntry = {
    val __obj = js.Dynamic.literal(name = name, referencingIds = referencingIds)
    __obj.updateDynamic("type")(`type`)
    if (aoid != null) __obj.updateDynamic("aoid")(aoid)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key)
    if (location != null) __obj.updateDynamic("location")(location)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (refId != null) __obj.updateDynamic("refId")(refId)
    if (term != null) __obj.updateDynamic("term")(term)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ProductionBiblioEntry]
  }
}

