package typings.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ContactGroup is is a group of contacts.
  */
@js.native
trait ContactGroup extends js.Object {
  
  def addContact(contact: Contact): ContactGroup = js.native
  
  def deleteGroup(): Unit = js.native
  
  def getContacts(): js.Array[Contact] = js.native
  
  /** @deprecated DO NOT USE */ def getGroupName(): String = js.native
  
  def getId(): String = js.native
  
  def getName(): String = js.native
  
  def isSystemGroup(): Boolean = js.native
  
  def removeContact(contact: Contact): ContactGroup = js.native
  
  /** @deprecated DO NOT USE */ def setGroupName(name: String): Unit = js.native
  
  def setName(name: String): ContactGroup = js.native
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
  
  @scala.inline
  implicit class ContactGroupOps[Self <: ContactGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddContact(value: Contact => ContactGroup): Self = this.set("addContact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteGroup(value: () => Unit): Self = this.set("deleteGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContacts(value: () => js.Array[Contact]): Self = this.set("getContacts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupName(value: () => String): Self = this.set("getGroupName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSystemGroup(value: () => Boolean): Self = this.set("isSystemGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveContact(value: Contact => ContactGroup): Self = this.set("removeContact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGroupName(value: String => Unit): Self = this.set("setGroupName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => ContactGroup): Self = this.set("setName", js.Any.fromFunction1(value))
  }
}
