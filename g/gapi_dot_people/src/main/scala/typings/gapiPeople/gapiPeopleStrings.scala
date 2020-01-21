package typings.gapiPeople

import typings.gapiPeople.gapi.client.people.NicknameType
import typings.gapiPeople.gapi.client.people.ObjectType
import typings.gapiPeople.gapi.client.people.SourceType
import typings.gapiPeople.gapi.client.people.people.connections.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gapiPeopleStrings {
  @js.native
  sealed trait ACCOUNT extends SourceType
  
  @js.native
  sealed trait CONTACT extends SourceType
  
  @js.native
  sealed trait DEFAULT extends NicknameType
  
  @js.native
  sealed trait DOMAIN_PROFILE extends SourceType
  
  @js.native
  sealed trait FIRST_NAME_ASCENDING extends SortOrder
  
  @js.native
  sealed trait GPLUS extends NicknameType
  
  @js.native
  sealed trait INITIALS extends NicknameType
  
  @js.native
  sealed trait LAST_MODIFIED_ASCENDING extends SortOrder
  
  @js.native
  sealed trait LAST_NAME_ASCENDING extends SortOrder
  
  @js.native
  sealed trait MAIDEN_NAME extends NicknameType
  
  @js.native
  sealed trait OBJECT_TYPE_UNSPECIFIED extends ObjectType
  
  @js.native
  sealed trait OTHER_NAME extends NicknameType
  
  @js.native
  sealed trait PAGE extends ObjectType
  
  @js.native
  sealed trait PERSON extends ObjectType
  
  @js.native
  sealed trait PROFILE extends SourceType
  
  @js.native
  sealed trait SOURCE_TYPE_UNSPECIFIED extends SourceType
  
  @scala.inline
  def ACCOUNT: ACCOUNT = "ACCOUNT".asInstanceOf[ACCOUNT]
  @scala.inline
  def CONTACT: CONTACT = "CONTACT".asInstanceOf[CONTACT]
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  @scala.inline
  def DOMAIN_PROFILE: DOMAIN_PROFILE = "DOMAIN_PROFILE".asInstanceOf[DOMAIN_PROFILE]
  @scala.inline
  def FIRST_NAME_ASCENDING: FIRST_NAME_ASCENDING = "FIRST_NAME_ASCENDING".asInstanceOf[FIRST_NAME_ASCENDING]
  @scala.inline
  def GPLUS: GPLUS = "GPLUS".asInstanceOf[GPLUS]
  @scala.inline
  def INITIALS: INITIALS = "INITIALS".asInstanceOf[INITIALS]
  @scala.inline
  def LAST_MODIFIED_ASCENDING: LAST_MODIFIED_ASCENDING = "LAST_MODIFIED_ASCENDING".asInstanceOf[LAST_MODIFIED_ASCENDING]
  @scala.inline
  def LAST_NAME_ASCENDING: LAST_NAME_ASCENDING = "LAST_NAME_ASCENDING".asInstanceOf[LAST_NAME_ASCENDING]
  @scala.inline
  def MAIDEN_NAME: MAIDEN_NAME = "MAIDEN_NAME".asInstanceOf[MAIDEN_NAME]
  @scala.inline
  def OBJECT_TYPE_UNSPECIFIED: OBJECT_TYPE_UNSPECIFIED = "OBJECT_TYPE_UNSPECIFIED".asInstanceOf[OBJECT_TYPE_UNSPECIFIED]
  @scala.inline
  def OTHER_NAME: OTHER_NAME = "OTHER_NAME".asInstanceOf[OTHER_NAME]
  @scala.inline
  def PAGE: PAGE = "PAGE".asInstanceOf[PAGE]
  @scala.inline
  def PERSON: PERSON = "PERSON".asInstanceOf[PERSON]
  @scala.inline
  def PROFILE: PROFILE = "PROFILE".asInstanceOf[PROFILE]
  @scala.inline
  def SOURCE_TYPE_UNSPECIFIED: SOURCE_TYPE_UNSPECIFIED = "SOURCE_TYPE_UNSPECIFIED".asInstanceOf[SOURCE_TYPE_UNSPECIFIED]
}

