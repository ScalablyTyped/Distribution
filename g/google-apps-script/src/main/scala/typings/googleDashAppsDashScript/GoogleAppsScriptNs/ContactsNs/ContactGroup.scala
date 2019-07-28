package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroup extends js.Object {
  def addContact(contact: Contact): ContactGroup
  def deleteGroup(): Unit
  def getContacts(): js.Array[Contact]
  def getGroupName(): String
  def getId(): String
  def getName(): String
  def isSystemGroup(): Boolean
  def removeContact(contact: Contact): ContactGroup
  def setGroupName(name: String): Unit
  def setName(name: String): ContactGroup
}

object ContactGroup {
  @scala.inline
  def apply(
    addContact: Contact => ContactGroup,
    deleteGroup: () => Unit,
    getContacts: () => js.Array[Contact],
    getGroupName: () => String,
    getId: () => String,
    getName: () => String,
    isSystemGroup: () => Boolean,
    removeContact: Contact => ContactGroup,
    setGroupName: String => Unit,
    setName: String => ContactGroup
  ): ContactGroup = {
    val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction1(addContact), deleteGroup = js.Any.fromFunction0(deleteGroup), getContacts = js.Any.fromFunction0(getContacts), getGroupName = js.Any.fromFunction0(getGroupName), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), isSystemGroup = js.Any.fromFunction0(isSystemGroup), removeContact = js.Any.fromFunction1(removeContact), setGroupName = js.Any.fromFunction1(setGroupName), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[ContactGroup]
  }
}

