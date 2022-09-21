package typings.eval

import typings.node.bufferMod.global.Buffer
import typings.node.vmMod.Script
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple way to evaluate a module content in the same way as require() but
    * without loading it from a file. Effectively, it mimicks the javascript evil
    * `eval` function but leverages Node's VM module instead.
    */
  inline def apply(/** The content to be evaluated. */
  content: String): Any = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(/** The content to be evaluated. */
  content: Buffer): Any = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Buffer,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(/** The content to be evaluated. */
  content: Script): Any = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: String,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional dummy name to be given (used in stacktraces). */
  filename: Unit,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional scope properties are provided as variables to the content. */
  scope: Unit,
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    /** The content to be evaluated. */
  content: Script,
    /** Optional scope properties are provided as variables to the content. */
  scope: Record[String, Any],
    /**
    * Optional flag to allow/disallow global variables (and require) to be
    * supplied to the content (default=false).
    */
  includeGlobals: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], includeGlobals.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("eval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
