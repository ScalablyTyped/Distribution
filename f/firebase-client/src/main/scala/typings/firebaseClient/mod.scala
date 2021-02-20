package typings.firebaseClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("firebase-client", JSImport.Namespace)
  @js.native
  val ^ : FirebaseClient = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("firebase-client", JSImport.Namespace)
  @js.native
  class Class protected () extends FirebaseClient {
    /**
      * Creates a new FirebaseClient given the provided configuration
      */
    def this(config: FirebaseConfig) = this()
  }
  
  @js.native
  trait FirebaseClient extends /**
    * Creates a new FirebaseClient given the provided configuration
    */
  Instantiable1[/* config */ FirebaseConfig, FirebaseClient] {
    
    /**
      * Deletes the resource at a given path
      * @param path Relative path from the base for the resource
      */
    def delete(path: String): Promise[Unit] = js.native
    
    /**
      * Retrieves all objects at the base path
      */
    def get[T](): Promise[T] = js.native
    /**
      * Retrieves an object
      * @param path Relative path from the base for the resource
      */
    def get[T](path: String): Promise[T] = js.native
    
    /**
      * @param path Relative path from the base for the resource
      * @param value Object to push to the path
      */
    def push[T](path: String, value: T): Promise[PushResponse] = js.native
    
    /**
      * Returns a promise of the HTTP response from setting the value at the given path
      * @param path Relative path from the base for the resource
      * @param data Data to be set as the value for the given path
      */
    def set[T](path: String, data: T): Promise[T] = js.native
    
    /**
      * Update a node at a given path
      * @param path Relative path from the base for the resource
      * @param value Value of the response
      */
    def update[T](path: String, value: T): Promise[T] = js.native
  }
  
  @js.native
  trait FirebaseConfig extends StObject {
    
    /**
      * Token for authorisation
      */
    var auth: String = js.native
    
    /**
      * path for the Firebase instance
      */
    var url: String = js.native
  }
  object FirebaseConfig {
    
    @scala.inline
    def apply(auth: String, url: String): FirebaseConfig = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseConfig]
    }
    
    @scala.inline
    implicit class FirebaseConfigMutableBuilder[Self <: FirebaseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PushResponse extends StObject {
    
    /**
      * Name ref (key) of the child resource
      */
    var name: String = js.native
  }
  object PushResponse {
    
    @scala.inline
    def apply(name: String): PushResponse = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushResponse]
    }
    
    @scala.inline
    implicit class PushResponseMutableBuilder[Self <: PushResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FirebaseClient
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FirebaseClient = ^
}
