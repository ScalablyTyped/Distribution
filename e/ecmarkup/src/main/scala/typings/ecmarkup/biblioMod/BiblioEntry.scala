package typings.ecmarkup.biblioMod

import typings.ecmarkup.ecmarkupStrings.clause
import typings.ecmarkup.ecmarkupStrings.example
import typings.ecmarkup.ecmarkupStrings.figure
import typings.ecmarkup.ecmarkupStrings.note
import typings.ecmarkup.ecmarkupStrings.op
import typings.ecmarkup.ecmarkupStrings.production
import typings.ecmarkup.ecmarkupStrings.step
import typings.ecmarkup.ecmarkupStrings.table
import typings.ecmarkup.ecmarkupStrings.term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkup.biblioMod.AlgorithmBiblioEntry
  - typings.ecmarkup.biblioMod.ProductionBiblioEntry
  - typings.ecmarkup.biblioMod.ClauseBiblioEntry
  - typings.ecmarkup.biblioMod.TermBiblioEntry
  - typings.ecmarkup.biblioMod.FigureBiblioEntry
  - typings.ecmarkup.biblioMod.StepBiblioEntry
*/
trait BiblioEntry extends js.Object

object BiblioEntry {
  @scala.inline
  def StepBiblioEntry(id: String, referencingIds: js.Array[String], stepNumbers: js.Array[Double], `type`: step): BiblioEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def TermBiblioEntry(refId: String, referencingIds: js.Array[String], term: String, `type`: term): BiblioEntry = {
    val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def ProductionBiblioEntry(name: String, referencingIds: js.Array[String], `type`: production): BiblioEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def AlgorithmBiblioEntry(aoid: String, referencingIds: js.Array[String], `type`: op): BiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    `type`: clause
  ): BiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def FigureBiblioEntry(
    id: String,
    number: String | Double,
    referencingIds: js.Array[String],
    `type`: table | figure | example | note
  ): BiblioEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
}

