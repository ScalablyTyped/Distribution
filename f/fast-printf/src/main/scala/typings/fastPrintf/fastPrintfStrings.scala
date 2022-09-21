package typings.fastPrintf

import typings.fastPrintf.typesMod.Flag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fastPrintfStrings {
  
  @js.native
  sealed trait `-Plussign`
    extends StObject
       with Flag
  inline def `-Plussign`: `-Plussign` = "-+".asInstanceOf[`-Plussign`]
  
  @js.native
  sealed trait `-_`
    extends StObject
       with Flag
  inline def `-_`: `-_` = "-".asInstanceOf[`-_`]
  
  @js.native
  sealed trait `0`
    extends StObject
       with Flag
  inline def `0`: `0` = "0".asInstanceOf[`0`]
  
  @js.native
  sealed trait Plussign
    extends StObject
       with Flag
  inline def Plussign: Plussign = "+".asInstanceOf[Plussign]
  
  @js.native
  sealed trait literal extends StObject
  inline def literal: literal = "literal".asInstanceOf[literal]
  
  @js.native
  sealed trait placeholder extends StObject
  inline def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
}
