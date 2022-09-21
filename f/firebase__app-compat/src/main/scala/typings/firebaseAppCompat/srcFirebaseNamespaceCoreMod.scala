package typings.firebaseAppCompat

import org.scalablytyped.runtime.Instantiable2
import typings.firebaseAppCompat.liteFirebaseAppLiteMod.FirebaseAppLiteImpl
import typings.firebaseAppCompat.srcFirebaseAppMod.FirebaseAppImpl
import typings.firebaseAppCompat.srcTypesMod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFirebaseNamespaceCoreMod {
  
  @JSImport("@firebase/app-compat/dist/src/firebaseNamespaceCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFirebaseNamespaceCore(
    firebaseAppImpl: Instantiable2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseAppExp */ /* _delegate */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAppExp */ Any, 
      /* firebase */ FirebaseNamespace, 
      FirebaseAppImpl | FirebaseAppLiteImpl
    ]
  ): FirebaseNamespace = ^.asInstanceOf[js.Dynamic].applyDynamic("createFirebaseNamespaceCore")(firebaseAppImpl.asInstanceOf[js.Any]).asInstanceOf[FirebaseNamespace]
}
