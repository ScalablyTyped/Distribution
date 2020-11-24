package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Contacts")
@js.native
object Contacts extends js.Object {
  
  /**
    * An enum for extended contacts fields.
    */
  @js.native
  object ExtendedField extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField with Double] = js.native
    
    /* 4 */ val BILLING_INFORMATION: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.BILLING_INFORMATION with Double = js.native
    
    /* 5 */ val DIRECTORY_SERVER: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.DIRECTORY_SERVER with Double = js.native
    
    /* 3 */ val GENDER: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.GENDER with Double = js.native
    
    /* 0 */ val HOBBY: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.HOBBY with Double = js.native
    
    /* 8 */ val HOME: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.HOME with Double = js.native
    
    /* 2 */ val LANGUAGE: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.LANGUAGE with Double = js.native
    
    /* 1 */ val MILEAGE: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.MILEAGE with Double = js.native
    
    /* 11 */ val OTHER: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.OTHER with Double = js.native
    
    /* 7 */ val PRIORITY: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.PRIORITY with Double = js.native
    
    /* 6 */ val SENSITIVITY: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.SENSITIVITY with Double = js.native
    
    /* 10 */ val USER: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.USER with Double = js.native
    
    /* 9 */ val WORK: typings.googleAppsScript.GoogleAppsScript.Contacts.ExtendedField.WORK with Double = js.native
  }
  
  /**
    * An enum for contacts fields.
    */
  @js.native
  object Field extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Contacts.Field with Double] = js.native
    
    /* 28 */ val AIM: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.AIM with Double = js.native
    
    /* 13 */ val ANNIVERSARY: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.ANNIVERSARY with Double = js.native
    
    /* 16 */ val ASSISTANT_PHONE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.ASSISTANT_PHONE with Double = js.native
    
    /* 12 */ val BIRTHDAY: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.BIRTHDAY with Double = js.native
    
    /* 35 */ val BLOG: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.BLOG with Double = js.native
    
    /* 17 */ val CALLBACK_PHONE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.CALLBACK_PHONE with Double = js.native
    
    /* 42 */ val COMPANY: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.COMPANY with Double = js.native
    
    /* 3 */ val FAMILY_NAME: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.FAMILY_NAME with Double = js.native
    
    /* 36 */ val FTP: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.FTP with Double = js.native
    
    /* 0 */ val FULL_NAME: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.FULL_NAME with Double = js.native
    
    /* 1 */ val GIVEN_NAME: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.GIVEN_NAME with Double = js.native
    
    /* 27 */ val GOOGLE_TALK: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.GOOGLE_TALK with Double = js.native
    
    /* 25 */ val GOOGLE_VOICE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.GOOGLE_VOICE with Double = js.native
    
    /* 14 */ val HOME_ADDRESS: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.HOME_ADDRESS with Double = js.native
    
    /* 10 */ val HOME_EMAIL: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.HOME_EMAIL with Double = js.native
    
    /* 20 */ val HOME_FAX: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.HOME_FAX with Double = js.native
    
    /* 38 */ val HOME_PAGE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.HOME_PAGE with Double = js.native
    
    /* 22 */ val HOME_PHONE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.HOME_PHONE with Double = js.native
    
    /* 40 */ val HOME_WEBSITE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.HOME_WEBSITE with Double = js.native
    
    /* 33 */ val ICQ: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.ICQ with Double = js.native
    
    /* 7 */ val INITIALS: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.INITIALS with Double = js.native
    
    /* 34 */ val JABBER: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.JABBER with Double = js.native
    
    /* 41 */ val JOB_TITLE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.JOB_TITLE with Double = js.native
    
    /* 4 */ val MAIDEN_NAME: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.MAIDEN_NAME with Double = js.native
    
    /* 18 */ val MAIN_PHONE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.MAIN_PHONE with Double = js.native
    
    /* 2 */ val MIDDLE_NAME: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.MIDDLE_NAME with Double = js.native
    
    /* 24 */ val MOBILE_PHONE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.MOBILE_PHONE with Double = js.native
    
    /* 32 */ val MSN: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.MSN with Double = js.native
    
    /* 5 */ val NICKNAME: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.NICKNAME with Double = js.native
    
    /* 26 */ val NOTES: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.NOTES with Double = js.native
    
    /* 19 */ val PAGER: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.PAGER with Double = js.native
    
    /* 8 */ val PREFIX: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.PREFIX with Double = js.native
    
    /* 37 */ val PROFILE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.PROFILE with Double = js.native
    
    /* 31 */ val QQ: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.QQ with Double = js.native
    
    /* 6 */ val SHORT_NAME: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.SHORT_NAME with Double = js.native
    
    /* 30 */ val SKYPE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.SKYPE with Double = js.native
    
    /* 9 */ val SUFFIX: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.SUFFIX with Double = js.native
    
    /* 15 */ val WORK_ADDRESS: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.WORK_ADDRESS with Double = js.native
    
    /* 11 */ val WORK_EMAIL: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.WORK_EMAIL with Double = js.native
    
    /* 21 */ val WORK_FAX: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.WORK_FAX with Double = js.native
    
    /* 23 */ val WORK_PHONE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.WORK_PHONE with Double = js.native
    
    /* 39 */ val WORK_WEBSITE: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.WORK_WEBSITE with Double = js.native
    
    /* 29 */ val YAHOO: typings.googleAppsScript.GoogleAppsScript.Contacts.Field.YAHOO with Double = js.native
  }
  
  /**
    * An enum for contact gender.
    */
  @js.native
  object Gender extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Contacts.Gender with Double] = js.native
    
    /* 1 */ val FEMALE: typings.googleAppsScript.GoogleAppsScript.Contacts.Gender.FEMALE with Double = js.native
    
    /* 0 */ val MALE: typings.googleAppsScript.GoogleAppsScript.Contacts.Gender.MALE with Double = js.native
  }
  
  /**
    * An enum for contact priority.
    */
  @js.native
  object Priority extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Contacts.Priority with Double] = js.native
    
    /* 0 */ val HIGH: typings.googleAppsScript.GoogleAppsScript.Contacts.Priority.HIGH with Double = js.native
    
    /* 1 */ val LOW: typings.googleAppsScript.GoogleAppsScript.Contacts.Priority.LOW with Double = js.native
    
    /* 2 */ val NORMAL: typings.googleAppsScript.GoogleAppsScript.Contacts.Priority.NORMAL with Double = js.native
  }
  
  /**
    * An enum for contact sensitivity.
    */
  @js.native
  object Sensitivity extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Contacts.Sensitivity with Double] = js.native
    
    /* 0 */ val CONFIDENTIAL: typings.googleAppsScript.GoogleAppsScript.Contacts.Sensitivity.CONFIDENTIAL with Double = js.native
    
    /* 1 */ val NORMAL: typings.googleAppsScript.GoogleAppsScript.Contacts.Sensitivity.NORMAL with Double = js.native
    
    /* 2 */ val PERSONAL: typings.googleAppsScript.GoogleAppsScript.Contacts.Sensitivity.PERSONAL with Double = js.native
    
    /* 3 */ val PRIVATE: typings.googleAppsScript.GoogleAppsScript.Contacts.Sensitivity.PRIVATE with Double = js.native
  }
}
