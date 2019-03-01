package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessNotebook extends js.Object {
  var businessNotebook: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.BusinessNotebook] = js.undefined
  var contact: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.User] = js.undefined
  var defaultNotebook: js.UndefOr[scala.Boolean] = js.undefined
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var published: js.UndefOr[scala.Boolean] = js.undefined
  var publishing: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.Publishing] = js.undefined
  var restrictions: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.NotebookRestrictions] = js.undefined
  var serviceCreated: js.UndefOr[scala.Double] = js.undefined
  var serviceUpdated: js.UndefOr[scala.Double] = js.undefined
  var sharedNotebookIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var sharedNotebooks: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.SharedNotebook]] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var updateSequenceNum: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BusinessNotebook {
  @scala.inline
  def apply(
    businessNotebook: evernoteLib.evernoteMod.EvernoteNs.BusinessNotebook = null,
    contact: evernoteLib.evernoteMod.EvernoteNs.User = null,
    defaultNotebook: js.UndefOr[scala.Boolean] = js.undefined,
    guid: java.lang.String = null,
    name: java.lang.String = null,
    published: js.UndefOr[scala.Boolean] = js.undefined,
    publishing: evernoteLib.evernoteMod.EvernoteNs.Publishing = null,
    restrictions: evernoteLib.evernoteMod.EvernoteNs.NotebookRestrictions = null,
    serviceCreated: scala.Int | scala.Double = null,
    serviceUpdated: scala.Int | scala.Double = null,
    sharedNotebookIds: js.Array[scala.Double] = null,
    sharedNotebooks: js.Array[evernoteLib.evernoteMod.EvernoteNs.SharedNotebook] = null,
    stack: java.lang.String = null,
    updateSequenceNum: scala.Int | scala.Double = null
  ): Anon_BusinessNotebook = {
    val __obj = js.Dynamic.literal()
    if (businessNotebook != null) __obj.updateDynamic("businessNotebook")(businessNotebook)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (!js.isUndefined(defaultNotebook)) __obj.updateDynamic("defaultNotebook")(defaultNotebook)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published)
    if (publishing != null) __obj.updateDynamic("publishing")(publishing)
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions)
    if (serviceCreated != null) __obj.updateDynamic("serviceCreated")(serviceCreated.asInstanceOf[js.Any])
    if (serviceUpdated != null) __obj.updateDynamic("serviceUpdated")(serviceUpdated.asInstanceOf[js.Any])
    if (sharedNotebookIds != null) __obj.updateDynamic("sharedNotebookIds")(sharedNotebookIds)
    if (sharedNotebooks != null) __obj.updateDynamic("sharedNotebooks")(sharedNotebooks)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BusinessNotebook]
  }
}

