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
    addContact: Contact => ContactGroup,
    deleteGroup: () => scala.Unit,
    getContacts: () => js.Array[Contact],
    getGroupName: () => java.lang.String,
    getId: () => java.lang.String,
    getName: () => java.lang.String,
    isSystemGroup: () => scala.Boolean,
    removeContact: Contact => ContactGroup,
    setGroupName: java.lang.String => scala.Unit,
    setName: java.lang.String => ContactGroup
  ): ContactGroup = {
    val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction1(addContact), deleteGroup = js.Any.fromFunction0(deleteGroup), getContacts = js.Any.fromFunction0(getContacts), getGroupName = js.Any.fromFunction0(getGroupName), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), isSystemGroup = js.Any.fromFunction0(isSystemGroup), removeContact = js.Any.fromFunction1(removeContact), setGroupName = js.Any.fromFunction1(setGroupName), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[ContactGroup]
  }
}

