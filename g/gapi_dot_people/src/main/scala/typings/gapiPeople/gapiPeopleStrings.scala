package typings.gapiPeople

import typings.gapiPeople.gapi.client.people.NicknameType
import typings.gapiPeople.gapi.client.people.ObjectType
import typings.gapiPeople.gapi.client.people.SourceType
import typings.gapiPeople.gapi.client.people.people.connections.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapiPeopleStrings {
  
  @js.native
  sealed trait ACCOUNT
    extends StObject
       with SourceType
  inline def ACCOUNT: ACCOUNT = "ACCOUNT".asInstanceOf[ACCOUNT]
  
  @js.native
  sealed trait CONTACT
    extends StObject
       with SourceType
  inline def CONTACT: CONTACT = "CONTACT".asInstanceOf[CONTACT]
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with NicknameType
  inline def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait DOMAIN_CONTACT
    extends StObject
       with SourceType
  inline def DOMAIN_CONTACT: DOMAIN_CONTACT = "DOMAIN_CONTACT".asInstanceOf[DOMAIN_CONTACT]
  
  @js.native
  sealed trait DOMAIN_PROFILE
    extends StObject
       with SourceType
  inline def DOMAIN_PROFILE: DOMAIN_PROFILE = "DOMAIN_PROFILE".asInstanceOf[DOMAIN_PROFILE]
  
  @js.native
  sealed trait FIRST_NAME_ASCENDING
    extends StObject
       with SortOrder
  inline def FIRST_NAME_ASCENDING: FIRST_NAME_ASCENDING = "FIRST_NAME_ASCENDING".asInstanceOf[FIRST_NAME_ASCENDING]
  
  @js.native
  sealed trait GPLUS
    extends StObject
       with NicknameType
  inline def GPLUS: GPLUS = "GPLUS".asInstanceOf[GPLUS]
  
  @js.native
  sealed trait INITIALS
    extends StObject
       with NicknameType
  inline def INITIALS: INITIALS = "INITIALS".asInstanceOf[INITIALS]
  
  @js.native
  sealed trait LAST_MODIFIED_ASCENDING
    extends StObject
       with SortOrder
  inline def LAST_MODIFIED_ASCENDING: LAST_MODIFIED_ASCENDING = "LAST_MODIFIED_ASCENDING".asInstanceOf[LAST_MODIFIED_ASCENDING]
  
  @js.native
  sealed trait LAST_NAME_ASCENDING
    extends StObject
       with SortOrder
  inline def LAST_NAME_ASCENDING: LAST_NAME_ASCENDING = "LAST_NAME_ASCENDING".asInstanceOf[LAST_NAME_ASCENDING]
  
  @js.native
  sealed trait MAIDEN_NAME
    extends StObject
       with NicknameType
  inline def MAIDEN_NAME: MAIDEN_NAME = "MAIDEN_NAME".asInstanceOf[MAIDEN_NAME]
  
  @js.native
  sealed trait OBJECT_TYPE_UNSPECIFIED
    extends StObject
       with ObjectType
  inline def OBJECT_TYPE_UNSPECIFIED: OBJECT_TYPE_UNSPECIFIED = "OBJECT_TYPE_UNSPECIFIED".asInstanceOf[OBJECT_TYPE_UNSPECIFIED]
  
  @js.native
  sealed trait OTHER_CONTACT
    extends StObject
       with SourceType
  inline def OTHER_CONTACT: OTHER_CONTACT = "OTHER_CONTACT".asInstanceOf[OTHER_CONTACT]
  
  @js.native
  sealed trait OTHER_NAME
    extends StObject
       with NicknameType
  inline def OTHER_NAME: OTHER_NAME = "OTHER_NAME".asInstanceOf[OTHER_NAME]
  
  @js.native
  sealed trait PAGE
    extends StObject
       with ObjectType
  inline def PAGE: PAGE = "PAGE".asInstanceOf[PAGE]
  
  @js.native
  sealed trait PERSON
    extends StObject
       with ObjectType
  inline def PERSON: PERSON = "PERSON".asInstanceOf[PERSON]
  
  @js.native
  sealed trait PROFILE
    extends StObject
       with SourceType
  inline def PROFILE: PROFILE = "PROFILE".asInstanceOf[PROFILE]
  
  @js.native
  sealed trait SOURCE_TYPE_UNSPECIFIED
    extends StObject
       with SourceType
  inline def SOURCE_TYPE_UNSPECIFIED: SOURCE_TYPE_UNSPECIFIED = "SOURCE_TYPE_UNSPECIFIED".asInstanceOf[SOURCE_TYPE_UNSPECIFIED]
}
