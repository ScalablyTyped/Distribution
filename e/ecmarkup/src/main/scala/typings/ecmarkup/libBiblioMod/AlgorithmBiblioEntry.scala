package typings.ecmarkup.libBiblioMod

import typings.ecmarkup.ecmarkupStrings.op
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("aoid")
  var aoid_AlgorithmBiblioEntry: String
  @JSName("type")
  var type_AlgorithmBiblioEntry: op
}

object AlgorithmBiblioEntry {
  @scala.inline
  def apply(
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
  ): AlgorithmBiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid, referencingIds = referencingIds)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (clauseId != null) __obj.updateDynamic("clauseId")(clauseId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (refId != null) __obj.updateDynamic("refId")(refId)
    if (term != null) __obj.updateDynamic("term")(term)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AlgorithmBiblioEntry]
  }
}

