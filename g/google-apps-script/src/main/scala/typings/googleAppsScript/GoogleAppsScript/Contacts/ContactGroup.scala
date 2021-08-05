package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ContactGroup is is a group of contacts.
  */
trait ContactGroup extends StObject {
  
  def addContact(contact: Contact): ContactGroup
  
  def deleteGroup(): Unit
  
  def getContacts(): js.Array[Contact]
  
  /** @deprecated DO NOT USE */ def getGroupName(): String
  
  def getId(): String
  
  def getName(): String
  
  def isSystemGroup(): Boolean
  
  def removeContact(contact: Contact): ContactGroup
  
  /** @deprecated DO NOT USE */ def setGroupName(name: String): Unit
  
  def setName(name: String): ContactGroup
}
object ContactGroup {
  
  inline def apply(
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
  
  extension [Self <: ContactGroup](x: Self) {
    
    inline def setAddContact(value: Contact => ContactGroup): Self = StObject.set(x, "addContact", js.Any.fromFunction1(value))
    
    inline def setDeleteGroup(value: () => Unit): Self = StObject.set(x, "deleteGroup", js.Any.fromFunction0(value))
    
    inline def setGetContacts(value: () => js.Array[Contact]): Self = StObject.set(x, "getContacts", js.Any.fromFunction0(value))
    
    inline def setGetGroupName(value: () => String): Self = StObject.set(x, "getGroupName", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setIsSystemGroup(value: () => Boolean): Self = StObject.set(x, "isSystemGroup", js.Any.fromFunction0(value))
    
    inline def setRemoveContact(value: Contact => ContactGroup): Self = StObject.set(x, "removeContact", js.Any.fromFunction1(value))
    
    inline def setSetGroupName(value: String => Unit): Self = StObject.set(x, "setGroupName", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => ContactGroup): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
