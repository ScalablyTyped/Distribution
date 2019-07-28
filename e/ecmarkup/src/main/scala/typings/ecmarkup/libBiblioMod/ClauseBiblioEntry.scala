package typings.ecmarkup.libBiblioMod

import typings.ecmarkup.ecmarkupStrings.clause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClauseBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("aoid")
  var aoid_ClauseBiblioEntry: String
  @JSName("id")
  var id_ClauseBiblioEntry: String
  @JSName("number")
  var number_ClauseBiblioEntry: String | Double
  var titleHTML: String
  @JSName("title")
  var title_ClauseBiblioEntry: String
  @JSName("type")
  var type_ClauseBiblioEntry: clause
}

object ClauseBiblioEntry {
  @scala.inline
  def apply(
    aoid: String,
    id: String,
    number: String | Double,
    referencingIds: js.Array[String],
    title: String,
    titleHTML: String,
    `type`: clause,
    caption: String = null,
    clauseId: String = null,
    key: String = null,
    location: String = null,
    name: String = null,
    namespace: String = null,
    refId: String = null,
    term: String = null
  ): ClauseBiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid, id = id, number = number.asInstanceOf[js.Any], referencingIds = referencingIds, title = title, titleHTML = titleHTML)
    __obj.updateDynamic("type")(`type`)
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

