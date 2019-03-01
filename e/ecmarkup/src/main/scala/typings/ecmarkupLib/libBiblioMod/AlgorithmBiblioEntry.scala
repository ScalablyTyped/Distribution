package typings
package ecmarkupLib.libBiblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("aoid")
  var aoid_AlgorithmBiblioEntry: java.lang.String
  @JSName("type")
  var type_AlgorithmBiblioEntry: ecmarkupLib.ecmarkupLibStrings.op
}

object AlgorithmBiblioEntry {
  @scala.inline
  def apply(
    aoid: java.lang.String,
    referencingIds: js.Array[java.lang.String],
    `type`: ecmarkupLib.ecmarkupLibStrings.op,
    caption: java.lang.String = null,
    clauseId: java.lang.String = null,
    id: java.lang.String = null,
    key: java.lang.String = null,
    location: java.lang.String = null,
    name: java.lang.String = null,
    namespace: java.lang.String = null,
    number: java.lang.String | scala.Double = null,
    refId: java.lang.String = null,
    term: java.lang.String = null,
    title: java.lang.String = null
  ): AlgorithmBiblioEntry = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("aoid")(aoid)
    __obj.updateDynamic("referencingIds")(referencingIds)
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

