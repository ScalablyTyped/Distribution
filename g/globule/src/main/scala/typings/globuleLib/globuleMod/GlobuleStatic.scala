package typings
package globuleLib.globuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobuleStatic extends js.Object {
  /**
    * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
    */
  def find(options: FindOptions): js.Array[java.lang.String] = js.native
  /**
    * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
    */
  def find(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def find(pattern: java.lang.String, options: FindOptions): js.Array[java.lang.String] = js.native
  /**
    * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
    */
  def find(pattern: java.lang.String, pattern2: java.lang.String): js.Array[java.lang.String] = js.native
  def find(pattern: java.lang.String, pattern2: java.lang.String, options: FindOptions): js.Array[java.lang.String] = js.native
  /**
    * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
    */
  def find(pattern: java.lang.String, pattern2: java.lang.String, pattern3: java.lang.String): js.Array[java.lang.String] = js.native
  def find(
    pattern: java.lang.String,
    pattern2: java.lang.String,
    pattern3: java.lang.String,
    options: FindOptions
  ): js.Array[java.lang.String] = js.native
  def find(pattern: java.lang.String, pattern2: java.lang.String, pattern3: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def find(
    pattern: java.lang.String,
    pattern2: java.lang.String,
    pattern3: js.Array[java.lang.String],
    options: FindOptions
  ): js.Array[java.lang.String] = js.native
  def find(pattern: java.lang.String, pattern2: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def find(pattern: java.lang.String, pattern2: js.Array[java.lang.String], options: FindOptions): js.Array[java.lang.String] = js.native
  def find(pattern: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def find(pattern: js.Array[java.lang.String], options: FindOptions): js.Array[java.lang.String] = js.native
  def find(pattern: js.Array[java.lang.String], pattern2: java.lang.String): js.Array[java.lang.String] = js.native
  def find(pattern: js.Array[java.lang.String], pattern2: java.lang.String, options: FindOptions): js.Array[java.lang.String] = js.native
  def find(pattern: js.Array[java.lang.String], pattern2: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def find(pattern: js.Array[java.lang.String], pattern2: js.Array[java.lang.String], options: FindOptions): js.Array[java.lang.String] = js.native
  /**
    * Tests pattern(s) against against one or more file paths and returns true if any files were matched, otherwise false.
    */
  def isMatch(patterns: java.lang.String, filepaths: java.lang.String): scala.Boolean = js.native
  def isMatch(
    patterns: java.lang.String,
    filepaths: java.lang.String,
    options: minimatchLib.minimatchMod.IOptions
  ): scala.Boolean = js.native
  def isMatch(patterns: java.lang.String, filepaths: js.Array[java.lang.String]): scala.Boolean = js.native
  def isMatch(
    patterns: java.lang.String,
    filepaths: js.Array[java.lang.String],
    options: minimatchLib.minimatchMod.IOptions
  ): scala.Boolean = js.native
  def isMatch(patterns: js.Array[java.lang.String], filepaths: java.lang.String): scala.Boolean = js.native
  def isMatch(
    patterns: js.Array[java.lang.String],
    filepaths: java.lang.String,
    options: minimatchLib.minimatchMod.IOptions
  ): scala.Boolean = js.native
  def isMatch(patterns: js.Array[java.lang.String], filepaths: js.Array[java.lang.String]): scala.Boolean = js.native
  def isMatch(
    patterns: js.Array[java.lang.String],
    filepaths: js.Array[java.lang.String],
    options: minimatchLib.minimatchMod.IOptions
  ): scala.Boolean = js.native
  /**
    * Given a set of source file paths, returns an array of src-dest file mapping objects
    */
  def mapping(filepaths: js.Array[java.lang.String]): js.Array[OneMapping] = js.native
  /**
    * Given a set of source file paths, returns an array of src-dest file mapping objects
    */
  def mapping(filepaths: js.Array[java.lang.String], filepaths2: js.Array[java.lang.String]): js.Array[OneMapping] = js.native
  /**
    * Given a set of source file paths, returns an array of src-dest file mapping objects
    */
  def mapping(
    filepaths: js.Array[java.lang.String],
    filepaths2: js.Array[java.lang.String],
    filepaths3: js.Array[java.lang.String]
  ): js.Array[OneMapping] = js.native
  def mapping(
    filepaths: js.Array[java.lang.String],
    filepaths2: js.Array[java.lang.String],
    filepaths3: js.Array[java.lang.String],
    options: MappingOptions
  ): js.Array[OneMapping] = js.native
  def mapping(
    filepaths: js.Array[java.lang.String],
    filepaths2: js.Array[java.lang.String],
    options: MappingOptions
  ): js.Array[OneMapping] = js.native
  def mapping(filepaths: js.Array[java.lang.String], options: MappingOptions): js.Array[OneMapping] = js.native
  /**
    * Given a set of source file paths, returns an array of src-dest file mapping objects
    */
  def mapping(options: MappingOptions): js.Array[OneMapping] = js.native
  /**
    * Match one or more globbing patterns against one or more file paths.
    * Returns a uniqued array of all file paths that match any of the specified globbing patterns.
    */
  def `match`(patterns: java.lang.String, filepaths: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(
    patterns: java.lang.String,
    filepaths: java.lang.String,
    options: minimatchLib.minimatchMod.IOptions
  ): js.Array[java.lang.String] = js.native
  def `match`(patterns: java.lang.String, filepaths: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def `match`(
    patterns: java.lang.String,
    filepaths: js.Array[java.lang.String],
    options: minimatchLib.minimatchMod.IOptions
  ): js.Array[java.lang.String] = js.native
  def `match`(patterns: js.Array[java.lang.String], filepaths: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(
    patterns: js.Array[java.lang.String],
    filepaths: java.lang.String,
    options: minimatchLib.minimatchMod.IOptions
  ): js.Array[java.lang.String] = js.native
  def `match`(patterns: js.Array[java.lang.String], filepaths: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def `match`(
    patterns: js.Array[java.lang.String],
    filepaths: js.Array[java.lang.String],
    options: minimatchLib.minimatchMod.IOptions
  ): js.Array[java.lang.String] = js.native
}

