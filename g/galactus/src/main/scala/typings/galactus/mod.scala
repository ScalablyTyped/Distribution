package typings.galactus

import typings.floraColossus.depTypesMod.DepType
import typings.floraColossus.depTypesMod.DepType.DEV
import typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL
import typings.floraColossus.depTypesMod.DepType.OPTIONAL
import typings.floraColossus.depTypesMod.DepType.PROD
import typings.galactus.anon.RootDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("galactus/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DestroyerOfModules protected ()
    extends typings.galactus.destroyerOfModulesMod.DestroyerOfModules {
    def this(hasRootDirectoryWalkerShouldKeepModuleTest: RootDirectory) = this()
  }
  
  @js.native
  class Walker protected ()
    extends typings.floraColossus.mod.Walker {
    def this(modulePath: String) = this()
  }
  
  def childDepType(parentType: DepType, childType: DepType): PROD | DEV | OPTIONAL | DEV_OPTIONAL = js.native
  def depTypeGreater(newType: DepType, existing: DepType): Boolean = js.native
  @js.native
  object DepType extends js.Object {
    /* 1 */ val DEV: typings.floraColossus.depTypesMod.DepType.DEV with Double = js.native
    /* 3 */ val DEV_OPTIONAL: typings.floraColossus.depTypesMod.DepType.DEV_OPTIONAL with Double = js.native
    /* 2 */ val OPTIONAL: typings.floraColossus.depTypesMod.DepType.OPTIONAL with Double = js.native
    /* 0 */ val PROD: typings.floraColossus.depTypesMod.DepType.PROD with Double = js.native
    /* 4 */ val ROOT: typings.floraColossus.depTypesMod.DepType.ROOT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.floraColossus.depTypesMod.DepType with Double] = js.native
  }
  
}

