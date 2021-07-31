package typings.googleapisCommon

import typings.googleapisCommon.schemaMod.HttpMethod
import typings.googleapisCommon.schemaMod.SchemaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleapisCommonStrings {
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethod
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethod
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait array
    extends StObject
       with SchemaType
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait boolean
    extends StObject
       with SchemaType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait int32 extends StObject
  @scala.inline
  def int32: int32 = "int32".asInstanceOf[int32]
  
  @js.native
  sealed trait integer
    extends StObject
       with SchemaType
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait `object`
    extends StObject
       with SchemaType
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait string
    extends StObject
       with SchemaType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}
