package typings.firebaseClient

import org.scalablytyped.runtime.Shortcut
import typings.firebaseClient.mod.FirebaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FirebaseClient extends Shortcut {
    
    @JSGlobal("FirebaseClient")
    @js.native
    val ^ : typings.firebaseClient.mod.FirebaseClient = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("FirebaseClient")
    @js.native
    class Class protected ()
      extends StObject
         with typings.firebaseClient.mod.FirebaseClient {
      /**
        * Creates a new FirebaseClient given the provided configuration
        */
      def this(config: FirebaseConfig) = this()
    }
    
    type _To = typings.firebaseClient.mod.FirebaseClient
    
    /* This means you don't have to write `^`, but can instead just say `FirebaseClient.foo` */
    override def _to: typings.firebaseClient.mod.FirebaseClient = ^
  }
}
