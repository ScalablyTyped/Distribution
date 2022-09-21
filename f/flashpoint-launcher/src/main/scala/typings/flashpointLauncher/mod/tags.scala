package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of Tag related API functions */
object tags {
  
  @JSImport("flashpoint-launcher", "tags")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Tag
    * @param name Name of the primary alias
    * @param categoryName Name of the category to use, Default if none given
    * @param aliases List of extra aliases to register
    */
  inline def createTag(name: String): js.Promise[js.UndefOr[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Tag]]]
  inline def createTag(name: String, categoryName: String): js.Promise[js.UndefOr[Tag]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(name.asInstanceOf[js.Any], categoryName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Tag]]]
  inline def createTag(name: String, categoryName: String, aliases: js.Array[String]): js.Promise[js.UndefOr[Tag]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(name.asInstanceOf[js.Any], categoryName.asInstanceOf[js.Any], aliases.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Tag]]]
  inline def createTag(name: String, categoryName: Unit, aliases: js.Array[String]): js.Promise[js.UndefOr[Tag]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(name.asInstanceOf[js.Any], categoryName.asInstanceOf[js.Any], aliases.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Tag]]]
  
  /**
    * Create a new Tag Category
    * @param name Name of the Tag Category
    * @param color Color to give the Tag Category
    */
  inline def createTagCategory(name: String, color: String): js.Promise[js.UndefOr[TagCategory]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTagCategory")(name.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[TagCategory]]]
  
  /**
    * Removes a Tag (from all Games)
    * @param tagId ID of Tag to remove
    * @param skipWarn If true, warn user before deleting tag from games.
    */
  inline def deleteTag(tagId: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTag")(tagId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def deleteTag(tagId: Double, skipWarn: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteTag")(tagId.asInstanceOf[js.Any], skipWarn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Removes a Tag Category. All owned Tags are moved to the first available Tag Category.
    * @param tagCategoryId ID of the Tag Category to remove
    */
  inline def deleteTagCategory(tagCategoryId: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTagCategory")(tagCategoryId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Finds all the Tags a Game is tagged with
    * @param gameId ID of the Game to find
    */
  inline def findGameTags(gameId: String): js.Promise[js.UndefOr[js.Array[Tag]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findGameTags")(gameId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Array[Tag]]]]
  
  /**
    * Finds a tag given an alias name
    * @param name Name of the Tag (any matching alias)
    */
  inline def findTag(name: String): js.Promise[js.UndefOr[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findTag")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Tag]]]
  
  /**
    * Find all Tag Categories
    */
  inline def findTagCategories(): js.Promise[js.Array[TagCategory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findTagCategories")().asInstanceOf[js.Promise[js.Array[TagCategory]]]
  
  // Tag Suggestions
  /**
    * Finds a list of Tag Suggestions given a string they start with
    * @param name Partial name that a tag starts with
    */
  inline def findTagSuggestions(name: String): js.Promise[js.Array[TagSuggestion]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findTagSuggestions")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[TagSuggestion]]]
  
  /**
    * Finds a list of tags that begins with a name (if given)
    * @param name Partial name that a tag starts with
    */
  inline def findTags(): js.Promise[js.Array[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findTags")().asInstanceOf[js.Promise[js.Array[Tag]]]
  inline def findTags(name: String): js.Promise[js.Array[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findTags")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Tag]]]
  
  // Tags
  /**
    * Finds a tag given it's ID
    * @param tagId ID of the Tag
    */
  inline def getTagById(tagId: Double): js.Promise[js.UndefOr[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagById")(tagId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Tag]]]
  
  // Tag Categories
  /**
    * Find a Tag Category by it's ID. (Useful when a Tag doesn't populate it)
    * @param categoryId ID of the Tag Category
    */
  inline def getTagCategoryById(categoryId: Double): js.Promise[js.UndefOr[TagCategory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagCategoryById")(categoryId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[TagCategory]]]
  
  // Misc
  /**
    * Merges 2 tags into a single tag.
    * @param mergeData Required data to merge.
    */
  inline def mergeTags(mergeData: MergeTagData): js.Promise[js.UndefOr[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeTags")(mergeData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Tag]]]
  
  /**
    * Updates a Tag
    * @param tag Tag data to save
    */
  inline def saveTag(tag: Tag): js.Promise[Tag] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tag]]
  
  /**
    * Update a Tag Category
    * @param tagCategory Tag Category data to save
    */
  inline def saveTagCategory(tagCategory: TagCategory): js.Promise[TagCategory] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveTagCategory")(tagCategory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TagCategory]]
}
