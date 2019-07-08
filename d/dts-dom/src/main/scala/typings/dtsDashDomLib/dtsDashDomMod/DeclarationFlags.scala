package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeclarationFlags extends js.Object

@JSImport("dts-dom", "DeclarationFlags")
@js.native
object DeclarationFlags extends js.Object {
  @js.native
  sealed trait Abstract
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  @js.native
  sealed trait Export
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  @js.native
  sealed trait ExportDefault
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  @js.native
  sealed trait None
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  @js.native
  sealed trait Optional
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  @js.native
  sealed trait Private
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  @js.native
  sealed trait Protected
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  @js.native
  sealed trait ReadOnly
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  @js.native
  sealed trait Static
    extends dtsDashDomLib.dtsDashDomMod.DeclarationFlags
  
  /* 32 */ val Abstract: Abstract with scala.Double = js.native
  /* 16 */ val Export: Export with scala.Double = js.native
  /* 64 */ val ExportDefault: ExportDefault with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 8 */ val Optional: Optional with scala.Double = js.native
  /* 1 */ val Private: Private with scala.Double = js.native
  /* 2 */ val Protected: Protected with scala.Double = js.native
  /* 128 */ val ReadOnly: ReadOnly with scala.Double = js.native
  /* 4 */ val Static: Static with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dtsDashDomLib.dtsDashDomMod.DeclarationFlags with scala.Double] = js.native
}

