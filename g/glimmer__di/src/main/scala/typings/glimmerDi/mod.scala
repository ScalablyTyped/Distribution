package typings.glimmerDi

import typings.glimmerDi.distTypesContainerMod.default
import typings.glimmerDi.distTypesOwnerMod.Owner
import typings.glimmerDi.distTypesRegistryMod.RegistryOptions
import typings.glimmerDi.distTypesRegistryMod.RegistryReader
import typings.glimmerDi.distTypesResolverMod.Resolver
import typings.glimmerDi.distTypesSpecifierMod.Specifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@glimmer/di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@glimmer/di", "Container")
  @js.native
  open class Container protected () extends default {
    def this(registry: RegistryReader) = this()
    def this(registry: RegistryReader, resolver: Resolver) = this()
  }
  
  @JSImport("@glimmer/di", "OWNER")
  @js.native
  val OWNER: /* "__owner__" */ String = js.native
  
  @JSImport("@glimmer/di", "Registry")
  @js.native
  open class Registry ()
    extends typings.glimmerDi.distTypesRegistryMod.default {
    def this(options: RegistryOptions) = this()
  }
  
  inline def deserializeSpecifier(specifier: String): Specifier = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSpecifier")(specifier.asInstanceOf[js.Any]).asInstanceOf[Specifier]
  
  inline def getOwner(`object`: js.Object): Owner = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwner")(`object`.asInstanceOf[js.Any]).asInstanceOf[Owner]
  
  inline def isSpecifierObjectAbsolute(specifier: Specifier): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpecifierObjectAbsolute")(specifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSpecifierStringAbsolute(specifier: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpecifierStringAbsolute")(specifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def serializeSpecifier(specifier: Specifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeSpecifier")(specifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setOwner(`object`: js.Object, owner: Owner): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOwner")(`object`.asInstanceOf[js.Any], owner.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
