package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientQueryBuilder.SaveCommandExecuted event.
  */
trait MVCxClientQueryBuilderSaveCommandExecutedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the Save command execution result.
    */
  var Result: String
}
object MVCxClientQueryBuilderSaveCommandExecutedEventArgs {
  
  inline def apply(Result: String): MVCxClientQueryBuilderSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientQueryBuilderSaveCommandExecutedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MVCxClientQueryBuilderSaveCommandExecutedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
