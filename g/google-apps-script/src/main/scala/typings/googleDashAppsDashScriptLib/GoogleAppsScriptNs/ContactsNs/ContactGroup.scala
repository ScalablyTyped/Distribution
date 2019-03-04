package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroup extends js.Object {
  def addContact(contact: Contact): ContactGroup
  def deleteGroup(): scala.Unit
  def getContacts(): js.Array[Contact]
  def getGroupName(): java.lang.String
  def getId(): java.lang.String
  def getName(): java.lang.String
  def isSystemGroup(): scala.Boolean
  def removeContact(contact: Contact): ContactGroup
  def setGroupName(name: java.lang.String): scala.Unit
  def setName(name: java.lang.String): ContactGroup
}

object ContactGroup {
  @scala.inline
  def apply(
    addContact: js.Function1[Contact, ContactGroup],
    deleteGroup: js.Function0[scala.Unit],
    getContacts: js.Function0[js.Array[Contact]],
    getGroupName: js.Function0[java.lang.String],
    getId: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    isSystemGroup: js.Function0[scala.Boolean],
    removeContact: js.Function1[Contact, ContactGroup],
    setGroupName: js.Function1[java.lang.String, scala.Unit],
    setName: js.Function1[java.lang.String, ContactGroup]
  ): ContactGroup = {
    val __obj = js.Dynamic.literal(addContact = addContact, deleteGroup = deleteGroup, getContacts = getContacts, getGroupName = getGroupName, getId = getId, getName = getName, isSystemGroup = isSystemGroup, removeContact = removeContact, setGroupName = setGroupName, setName = setName)
  
    __obj.asInstanceOf[ContactGroup]
  }
}

