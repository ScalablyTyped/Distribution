package typings
package ecmarkupLib.libBiblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BiblioEntryBase extends js.Object {
  var aoid: js.UndefOr[java.lang.String] = js.undefined
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var clauseId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var refId: js.UndefOr[java.lang.String] = js.undefined
  var referencingIds: js.Array[java.lang.String]
  var term: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object BiblioEntryBase {
  @scala.inline
  def apply(
    referencingIds: js.Array[java.lang.String],
    `type`: java.lang.String,
    aoid: java.lang.String = null,
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
  ): BiblioEntryBase = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("referencingIds")(referencingIds)
    if (aoid != null) __obj.updateDynamic("aoid")(aoid)
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
    __obj.asInstanceOf[BiblioEntryBase]
  }
}

