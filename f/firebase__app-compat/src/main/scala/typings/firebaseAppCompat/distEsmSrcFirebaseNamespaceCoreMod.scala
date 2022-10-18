package typings.firebaseAppCompat

import org.scalablytyped.runtime.Instantiable2
import typings.firebaseAppCompat.distEsmSrcFirebaseAppMod.FirebaseAppImpl
import typings.firebaseAppCompat.distEsmSrcLiteFirebaseAppLiteMod.FirebaseAppLiteImpl
import typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcFirebaseNamespaceCoreMod {
  
  @JSImport("@firebase/app-compat/dist/esm/src/firebaseNamespaceCore", JSImport.Namespace)
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
