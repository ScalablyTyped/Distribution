package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends StObject
@JSGlobal("ej.ContentType")
@js.native
object ContentType extends StObject {
  
  //Supports to display  image for both ends of the button
  @js.native
  sealed trait ImageBoth
    extends StObject
       with ContentType
  
  //To display the image only in button
  @js.native
  sealed trait ImageOnly
    extends StObject
       with ContentType
  
  //Supports to display  image with both ends of the text
  @js.native
  sealed trait ImageTextImage
    extends StObject
       with ContentType
  
  //Supports to display image with the text content
  @js.native
  sealed trait TextAndImage
    extends StObject
       with ContentType
  
  //To display the text content only in button
  @js.native
  sealed trait TextOnly
    extends StObject
       with ContentType
}
