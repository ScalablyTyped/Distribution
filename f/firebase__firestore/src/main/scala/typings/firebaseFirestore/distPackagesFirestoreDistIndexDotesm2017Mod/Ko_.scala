package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

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
  * A memory-backed instance of Persistence. Data is stored only in RAM and
  * not persisted across sessions.
  */
@js.native
trait Ko_ extends StObject {
  
  @JSName("$s")
  var $s: Boolean = js.native
  
  var Fs: Uo = js.native
  
  def Ks(t: Any, e: Any): vt = js.native
  
  var Ls: Mo = js.native
  
  var Os: t = js.native
  
  def getBundleCache(): Mo = js.native
  
  def getDocumentOverlayCache(t: Any): Any = js.native
  
  def getIndexManager(t: Any): zr = js.native
  
  def getMutationQueue(t: Any, e: Any): Any = js.native
  
  def getRemoteDocumentCache(): Lo_ = js.native
  
  def getTargetCache(): Uo = js.native
  
  var indexManager: zr = js.native
  
  var referenceDelegate: Any = js.native
  
  var remoteDocumentCache: Lo_ = js.native
  
  def runTransaction(t: Any, e: Any, n: Any): Any = js.native
  
  var serializer: ar = js.native
  
  def setDatabaseDeletedListener(): Unit = js.native
  
  def setNetworkEnabled(): Unit = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  def started: Boolean = js.native
}
