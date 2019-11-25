package typings.ecmarkup.libBiblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BiblioEntryBase extends js.Object {
  var aoid: js.UndefOr[String] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var clauseId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String | Double] = js.undefined
  var refId: js.UndefOr[String] = js.undefined
  var referencingIds: js.Array[String]
  var term: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: String
}

object BiblioEntryBase {
  @scala.inline
  def apply(
    referencingIds: js.Array[String],
    `type`: String,
    aoid: String = null,
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
  ): BiblioEntryBase = {
    val __obj = js.Dynamic.literal(referencingIds = referencingIds.asInstanceOf[js.Any])
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
    if (refId != null) __obj.updateDynamic("refId")(refId.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntryBase]
  }
}

