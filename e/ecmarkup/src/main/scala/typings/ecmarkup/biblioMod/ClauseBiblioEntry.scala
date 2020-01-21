package typings.ecmarkup.biblioMod

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
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (refId != null) __obj.updateDynamic("refId")(refId.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClauseBiblioEntry]
  }
}

