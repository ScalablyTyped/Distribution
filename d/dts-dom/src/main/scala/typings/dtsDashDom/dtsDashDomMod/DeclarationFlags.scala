package typings.dtsDashDom.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeclarationFlags extends js.Object

@JSImport("dts-dom", "DeclarationFlags")
@js.native
object DeclarationFlags extends js.Object {
  @js.native
  sealed trait Abstract extends DeclarationFlags
  
  @js.native
  sealed trait Export extends DeclarationFlags
  
  @js.native
  sealed trait ExportDefault extends DeclarationFlags
  
  @js.native
  sealed trait None extends DeclarationFlags
  
  @js.native
  sealed trait Optional extends DeclarationFlags
  
  @js.native
  sealed trait Private extends DeclarationFlags
  
  @js.native
  sealed trait Protected extends DeclarationFlags
  
  @js.native
  sealed trait ReadOnly extends DeclarationFlags
  
  @js.native
  sealed trait Static extends DeclarationFlags
  
  /* 32 */ val Abstract: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.Abstract with Double = js.native
  /* 16 */ val Export: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.Export with Double = js.native
  /* 64 */ val ExportDefault: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.ExportDefault with Double = js.native
  /* 0 */ val None: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.None with Double = js.native
  /* 8 */ val Optional: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.Optional with Double = js.native
  /* 1 */ val Private: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.Private with Double = js.native
  /* 2 */ val Protected: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.Protected with Double = js.native
  /* 128 */ val ReadOnly: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.ReadOnly with Double = js.native
  /* 4 */ val Static: typings.dtsDashDom.dtsDashDomMod.DeclarationFlags.Static with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeclarationFlags with Double] = js.native
}

