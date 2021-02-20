package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveAssetSourceWebMod {
  
  @JSImport("expo-asset/build/resolveAssetSource.web", JSImport.Default)
  @js.native
  def default(source: js.Any): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedAssetSource */ js.Any
  ] = js.native
  
  @JSImport("expo-asset/build/resolveAssetSource.web", "pickScale")
  @js.native
  val pickScale: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof AssetSourceResolver.pickScale */ js.Any = js.native
  
  @JSImport("expo-asset/build/resolveAssetSource.web", "setCustomSourceTransformer")
  @js.native
  def setCustomSourceTransformer(
    transformer: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AssetSourceResolver */ /* resolver */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedAssetSource */ _
    ]
  ): Unit = js.native
}
