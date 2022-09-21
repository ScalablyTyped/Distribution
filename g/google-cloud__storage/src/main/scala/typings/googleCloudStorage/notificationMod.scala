package typings.googleCloudStorage

import typings.googleCloudStorage.bucketMod.Bucket
import typings.googleCloudStorage.nodejsCommonMod.ServiceObject
import typings.googleCloudStorage.serviceObjectMod.Metadata
import typings.googleCloudStorage.serviceObjectMod.MetadataCallback
import typings.googleCloudStorage.utilMod.ResponseBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  /**
    * The API-formatted resource description of the notification.
    *
    * Note: This is not guaranteed to be up-to-date when accessed. To get the
    * latest record, call the `getMetadata()` method.
    *
    * @name Notification#metadata
    * @type {object}
    */
  /**
    * A Notification object is created from your {@link Bucket} object using
    * {@link Bucket#notification}. Use it to interact with Cloud Pub/Sub
    * notifications.
    *
    * See {@link https://cloud.google.com/storage/docs/pubsub-notifications| Cloud Pub/Sub Notifications for Google Cloud Storage}
    *
    * @class
    * @hideconstructor
    *
    * @param {Bucket} bucket The bucket instance this notification is attached to.
    * @param {string} id The ID of the notification.
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const myBucket = storage.bucket('my-bucket');
    *
    * const notification = myBucket.notification('1');
    * ```
    */
  @JSImport("@google-cloud/storage/build/src/notification", "Notification")
  @js.native
  open class Notification protected () extends ServiceObject[Any] {
    def this(bucket: Bucket, id: String) = this()
    
    def delete(options: DeleteNotificationOptions): js.Promise[js.Array[Metadata]] = js.native
    def delete(options: DeleteNotificationOptions, callback: DeleteNotificationCallback): Unit = js.native
    
    def get(options: GetNotificationOptions): js.Promise[GetNotificationResponse] = js.native
    def get(options: GetNotificationOptions, callback: GetNotificationCallback): Unit = js.native
    
    def getMetadata(options: GetNotificationMetadataOptions): js.Promise[GetNotificationMetadataResponse] = js.native
    def getMetadata(options: GetNotificationMetadataOptions, callback: MetadataCallback): Unit = js.native
  }
  
  type DeleteNotificationCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
  
  trait DeleteNotificationOptions extends StObject {
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object DeleteNotificationOptions {
    
    inline def apply(): DeleteNotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNotificationOptions]
    }
    
    extension [Self <: DeleteNotificationOptions](x: Self) {
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetNotificationCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* notification */ js.UndefOr[Notification | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  type GetNotificationMetadataCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* metadata */ js.UndefOr[ResponseBody], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  trait GetNotificationMetadataOptions extends StObject {
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object GetNotificationMetadataOptions {
    
    inline def apply(): GetNotificationMetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNotificationMetadataOptions]
    }
    
    extension [Self <: GetNotificationMetadataOptions](x: Self) {
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetNotificationMetadataResponse = js.Tuple2[ResponseBody, Metadata]
  
  trait GetNotificationOptions extends StObject {
    
    /**
      * Automatically create the object if it does not exist. Default: `false`.
      */
    var autoCreate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The ID of the project which will be billed for the request.
      */
    var userProject: js.UndefOr[String] = js.undefined
  }
  object GetNotificationOptions {
    
    inline def apply(): GetNotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNotificationOptions]
    }
    
    extension [Self <: GetNotificationOptions](x: Self) {
      
      inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetNotificationResponse = js.Tuple2[Notification, Metadata]
}
