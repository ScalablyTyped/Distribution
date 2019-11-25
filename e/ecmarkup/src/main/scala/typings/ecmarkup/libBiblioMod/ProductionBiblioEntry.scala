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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (aoid != null) __obj.updateDynamic("aoid")(aoid.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (refId != null) __obj.updateDynamic("refId")(refId.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionBiblioEntry]
  }
}

