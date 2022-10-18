package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * A class that holds metadata about a Repo object
  */
@js.native
trait RepoInfo extends StObject {
  
  /* private */ var _domain: Any = js.native
  
  /* private */ var _host: Any = js.native
  
  def host: String = js.native
  def host_=(newHost: String): Unit = js.native
  
  val includeNamespaceInQueryParams: Boolean = js.native
  
  var internalHost: String = js.native
  
  def isCacheableHost(): Boolean = js.native
  
  def isCustomHost(): Boolean = js.native
  
  val namespace: String = js.native
  
  val nodeAdmin: Boolean = js.native
  
  val persistenceKey: String = js.native
  
  val secure: Boolean = js.native
  
  def toURLString(): String = js.native
  
  val webSocketOnly: Boolean = js.native
}
