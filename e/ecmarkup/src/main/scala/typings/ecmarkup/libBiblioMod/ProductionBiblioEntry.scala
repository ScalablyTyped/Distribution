package typings.ecmarkup.libBiblioMod

import typings.ecmarkup.ecmarkupStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("name")
  var name_ProductionBiblioEntry: String
  @JSName("type")
  var type_ProductionBiblioEntry: production
}

object ProductionBiblioEntry {
  @scala.inline
  def apply(
    name: String,
    referencingIds: js.Array[String],
    `type`: production,
    aoid: String = null,
    caption: String = null,
    clauseId: String = null,
    id: String = null,
    key: String = null,
    location: String = null,
    namespace: String = null,
    number: String | Double = null,
    refId: String = null,
    term: String = null,
    title: String = null
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

