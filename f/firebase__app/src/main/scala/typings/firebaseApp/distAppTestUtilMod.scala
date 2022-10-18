package typings.firebaseApp

import typings.firebaseApp.distAppSrcPublicTypesMod.FirebaseApp
import typings.firebaseApp.distAppSrcPublicTypesMod.FirebaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppTestUtilMod {
  
  @JSImport("@firebase/app/dist/app/test/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app/dist/app/test/util", "TestService")
  @js.native
  open class TestService protected ()
    extends StObject
       with FirebaseService {
    def this(app_ : FirebaseApp) = this()
    def this(app_ : FirebaseApp, instanceIdentifier: String) = this()
    
    /**
      * Delete the service and free it's resources - called from
      * {@link @firebase/app#deleteApp | deleteApp()}
      */
    /* CompleteClass */
    override def _delete(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    var app: FirebaseApp = js.native
    
    /* private */ var app_ : Any = js.native
    
    @JSName("app")
    def app_MTestService: FirebaseApp = js.native
    
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
