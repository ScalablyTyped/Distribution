package typings.googleCloudFirestore

import typings.googleCloudFirestore.FirebaseFirestore.DocumentChangeType
import typings.googleCloudFirestore.FirebaseFirestore.OrderByDirection
import typings.googleCloudFirestore.FirebaseFirestore.WhereFilterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleCloudFirestoreStrings {
  
  @js.native
  sealed trait EqualssignEqualssign
    extends StObject
       with WhereFilterOp
  inline def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with WhereFilterOp
  inline def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with WhereFilterOp
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with WhereFilterOp
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with WhereFilterOp
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with WhereFilterOp
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait added
    extends StObject
       with DocumentChangeType
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait `array-contains`
    extends StObject
       with WhereFilterOp
  inline def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any`
    extends StObject
       with WhereFilterOp
  inline def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait asc
    extends StObject
       with OrderByDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait create extends StObject
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait desc
    extends StObject
       with OrderByDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait in
    extends StObject
       with WhereFilterOp
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait modified
    extends StObject
       with DocumentChangeType
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait `not-in`
    extends StObject
       with WhereFilterOp
  inline def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait removed
    extends StObject
       with DocumentChangeType
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait set extends StObject
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait update extends StObject
  inline def update: update = "update".asInstanceOf[update]
}
