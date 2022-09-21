package typings.firebaseFirestore.indexEsm2017Mod

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
  * Path represents an ordered sequence of string segments.
  */
@js.native
trait st extends StObject {
  
  def child(t: Any): Any = js.native
  
  def firstSegment(): Any = js.native
  
  def forEach(t: Any): Unit = js.native
  
  def get(t: Any): Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isEqual(t: Any): Boolean = js.native
  
  def isImmediateParentOf(t: Any): Boolean = js.native
  
  def isPrefixOf(t: Any): Boolean = js.native
  
  def lastSegment(): Any = js.native
  
  var len: Any = js.native
  
  def length: Any = js.native
  
  /** The index of one past the last segment of the path. */ def limit(): Any = js.native
  
  var offset: Any = js.native
  
  def popFirst(t: Any): Any = js.native
  
  def popLast(): Any = js.native
  
  var segments: Any = js.native
  
  def toArray(): Any = js.native
}
