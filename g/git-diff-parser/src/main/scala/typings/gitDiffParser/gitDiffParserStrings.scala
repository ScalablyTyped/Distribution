package typings.gitDiffParser

import typings.gitDiffParser.mod.LineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitDiffParserStrings {
  
  @js.native
  sealed trait added
    extends StObject
       with LineType
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait deleted
    extends StObject
       with LineType
  inline def deleted: deleted = "deleted".asInstanceOf[deleted]
  
  @js.native
  sealed trait normal
    extends StObject
       with LineType
  inline def normal: normal = "normal".asInstanceOf[normal]
}
