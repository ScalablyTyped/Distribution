package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildResolveAssetSourceDotwebMod {
  
  @JSImport("expo-asset/build/resolveAssetSource.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: Any): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedAssetSource */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedAssetSource */ Any
  ]]
  
  @JSImport("expo-asset/build/resolveAssetSource.web", "pickScale")
  @js.native
  val pickScale: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof AssetSourceResolver.pickScale */ Any = js.native
  
  inline def setCustomSourceTransformer(
    transformer: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AssetSourceResolver */ /* resolver */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedAssetSource */ Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomSourceTransformer")(transformer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
