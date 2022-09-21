package typings.firebaseAppCompat

import typings.firebaseAppCompat.publicTypesMod.FirebaseApp
import typings.firebaseAppCompat.typesMod.FirebaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@firebase/app-compat/dist/esm/test/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app-compat/dist/esm/test/util", "TestService")
  @js.native
  open class TestService protected ()
    extends StObject
       with FirebaseService {
    def this(app_ : FirebaseApp) = this()
    def this(app_ : FirebaseApp, instanceIdentifier: String) = this()
    
    /* CompleteClass */
    var _delegate: Any = js.native
    
    /* CompleteClass */
    var app: FirebaseApp = js.native
    
    /* private */ var app_ : Any = js.native
    
    @JSName("app")
    def app_MTestService: FirebaseApp = js.native
    
    def delete(): js.Promise[Unit] = js.native
    
    var instanceIdentifier: js.UndefOr[String] = js.native
  }
  
  inline def createTestComponent(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestComponent")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createTestComponent(name: String, multiInstances: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestComponent")(name.asInstanceOf[js.Any], multiInstances.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createTestComponent(
    name: String,
    multiInstances: Boolean,
    `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestComponent")(name.asInstanceOf[js.Any], multiInstances.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createTestComponent(
    name: String,
    multiInstances: Unit,
    `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestComponent")(name.asInstanceOf[js.Any], multiInstances.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
}
