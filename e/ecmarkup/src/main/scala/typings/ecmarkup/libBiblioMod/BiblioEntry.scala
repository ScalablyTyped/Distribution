package typings.ecmarkup.libBiblioMod

import typings.ecmarkup.ecmarkupStrings.clause
import typings.ecmarkup.ecmarkupStrings.example
import typings.ecmarkup.ecmarkupStrings.figure
import typings.ecmarkup.ecmarkupStrings.note
import typings.ecmarkup.ecmarkupStrings.op
import typings.ecmarkup.ecmarkupStrings.production
import typings.ecmarkup.ecmarkupStrings.table
import typings.ecmarkup.ecmarkupStrings.term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkup.libBiblioMod.AlgorithmBiblioEntry
  - typings.ecmarkup.libBiblioMod.ProductionBiblioEntry
  - typings.ecmarkup.libBiblioMod.ClauseBiblioEntry
  - typings.ecmarkup.libBiblioMod.TermBiblioEntry
  - typings.ecmarkup.libBiblioMod.FigureBiblioEntry
*/
trait BiblioEntry extends js.Object

object BiblioEntry {
  @scala.inline
  def FigureBiblioEntry(
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
  ): BiblioEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (aoid != null) __obj.updateDynamic("aoid")(aoid.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (refId != null) __obj.updateDynamic("refId")(refId.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def ProductionBiblioEntry(
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
  ): BiblioEntry = {
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
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def AlgorithmBiblioEntry(
    aoid: String,
    referencingIds: js.Array[String],
    `type`: op,
    caption: String = null,
    clauseId: String = null,
    id: String = null,
    key: String = null,
    location: String = null,
    name: String = null,
    namespace: String = null,
    number: String | Double = null,
    refId: String = null,
    term: String = null,
    title: String = null
  ): BiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (refId != null) __obj.updateDynamic("refId")(refId.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def ClauseBiblioEntry(
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
  ): BiblioEntry = {
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
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def TermBiblioEntry(
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
  ): BiblioEntry = {
    val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (aoid != null) __obj.updateDynamic("aoid")(aoid.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
}

